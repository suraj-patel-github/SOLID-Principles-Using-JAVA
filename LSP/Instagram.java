package LSP;

import LSP.solution.PostMediaManager;
import LSP.solution.SocialMedia;

/* now we have to implement only SocialMedia interface's methods only*/
public class Instagram implements SocialMedia, PostMediaManager {
    @Override
    public void chatWithFriend() {
        System.out.println("chat with friend");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("send photos and videos");
    }

    @Override
    public void publishPost(Object post) {

    }
}
