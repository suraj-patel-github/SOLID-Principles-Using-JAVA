package LSP;

/*LSP : Here we need to structure the code in such a way that the derived class must be substitutable
 with the parent class.*/
public abstract class SocialMedia {

    // Facebook, Instagram, whatsapp
    public abstract void chatWithFriend();

    // Facebook, Instagram
    public abstract void publishPost(Object post);

    // Facebook, Instagram, whatsapp
    public abstract void sendPhotosAndVideos();

    // Facebook, whatsapp
    public abstract void groupVideoCall(String... users);
}
