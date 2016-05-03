import java.util.Hashtable;

public class UserCache {
	
   // long would be user ID
   private static Hashtable<long, User> userMap = new Hashtable<long, User>();

   public static User getUserCloned(long userId) {
      User cachedUser = UserMap.get(userId);
      return cachedUser.clone();
   }

   public static void setUserCache(long userID) {
      User user = new User();
      user.setId(userID);
      userMap.put(user.getId(), user);
   }
}