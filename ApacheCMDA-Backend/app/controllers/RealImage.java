public class RealImage implements Image {

   private String fileName;

   public RealImage(String imageFileName){
      this.fileName = imageFileName;
      loadFromDisk(fileName);
   }
   
   public Result uploadImage(Long id) {
        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart image = body.getFile("image");

        Workflow workflow = workflowRepository.findOne(id);
        if (image != null) {
            File imgFile = image.getFile();
            String imgPathToSave = "public/images/" + "image_" + id + ".jpg";

            //save on disk
            boolean success = new File("images").mkdirs();
            try {
                byte[] bytes = IOUtils.toByteArray(new FileInputStream(imgFile));
                FileUtils.writeByteArrayToFile(new File(imgPathToSave), bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
            workflow.setWfImg(imgPathToSave);
            workflowRepository.save(workflow);
            return ok("File uploaded");
        } else {
            flash("error", "Missing file");
            return Common.badRequestWrapper("Wrong!!!!!!!!");
            // return redirect(routes.Application.index());
        }
    }

   @Override
   public void display() {
      System.out.println("Displaying " + fileName);
   }

   private void loadFromDisk(String fileName){
      System.out.println("Loading " + fileName);
   }
}