public class ProxyImage implements Image{

   private RealImage realImage;
   private String fileName;

   public ProxyImage(String fileName){
      this.fileName = fileName;
   }

   @Override
   public Result uploadImage(Long id) {
      if(realImage == null){
         // update the real image
         realImage = new RealImage(fileName);
      } else {
         System.out.print("Image already exists.");
      }
      return realImage.uploadImage(id);
   }
}