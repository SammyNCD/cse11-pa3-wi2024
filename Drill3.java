class VideoComment {
    String text;
    int likes;
    int replies;

    VideoComment(String text, int likes, int replies) {
        this.text = text;
        this.likes = likes;
        this.replies = replies;

    }

    boolean hasMention(String username) {
        String userHandle = "@" + username;
        if (this.text.contains(userHandle)) {
            return true;
        }
        return false;
    }

    boolean hasReply() {
        if (this.replies > 0) {
            return true;
        } 
        return false;
    }

    String firstMention() {
        if (this.text.contains("@") == false || this.text.contains(" ") == false) {
            return "";
        } else {
            String wantedText = text.substring(text.indexOf("@"));
            return wantedText.substring(wantedText.indexOf("@") + 1, wantedText.indexOf(" "));
        }
    }
}

class CommentReply {
    VideoComment replyTo;
    String text;
    int likes;
    int replies;

    CommentReply(VideoComment replyTo, String text, int likes, int replies) {
        this.replyTo = replyTo;
        this.text = text;
        this.likes = likes;
        this.replies = replies;

    }

    boolean morePopularReply() {
        if (this.likes > replyTo.likes) {
            return true;
        } 
        return false;
    }

    int allLikes() {
        return this.likes + replyTo.likes;
    }

    boolean hasMention(String username) {
        String fullHandle = "@" + username;
        if (this.text.contains(fullHandle) || replyTo.text.contains(fullHandle)) {
            return true;
        }
        return false;
    }
}

class Drill3 {

    // Video Objects
    VideoComment vid1 = new VideoComment("@TestMe", 1, 4);
    VideoComment vid2 = new VideoComment("Hello Mr. @Sammy how's it going", 999, 2);
    VideoComment vid3 = new VideoComment("Thing @TestMe again", 1, 2);
    VideoComment noReplys = new VideoComment(null, 0, 0);
    
    // VideoComment Method Tests
    boolean hasMentionResult2 = vid1.hasMention("TestMeWrong"); // Expected: False
    boolean hasMentionResult1 = vid2.hasMention("Sammy"); // Expected: True
    
    boolean hasReplyResult1 = noReplys.hasReply(); // Expected: False
    boolean hasReplyResult2 = vid2.hasReply(); // Expected: True
    
    String firstMentionResult1 = vid1.firstMention(); // Expected: ""
    String firstMentionResult2 = vid3.firstMention(); // Expected: "TestMe"
    String firstMentionResult3 = vid2.firstMention(); // Expected: "Sammy"

    // Comment Objects
    CommentReply comment1 = new CommentReply(vid2, "Hello Mr. @WrongUser how are you?", 1, 12);
    CommentReply comment2 = new CommentReply(vid1, "", 200, 1);
    CommentReply comment3 = new CommentReply(vid3, "@Person testing 123...", 0, 0);

    // CommentReply Method Tests
    boolean morePopularReplyResult1 = comment1.morePopularReply(); // Expected: False
    boolean morePopularReplyResult2 = comment2.morePopularReply(); // Expected: True

    int allLikesResult1 = comment1.allLikes(); // Expected: 1000
    int allLikesResult2 = comment2.allLikes(); // Expected: 201

    boolean commentHasMentionResult1 = comment3.hasMention("Loser"); // Expected False
    boolean commentHasMentionResult2 = comment1.hasMention("Sammy"); // Expected True
    boolean commentHasMentionResult3 = comment1.hasMention("nope"); // Expected False

    // Open-Ended 2: Not possible
    VideoComment vidTest = new VideoComment("This is a @Video Comment", 10, 4);
    CommentReply vidCommentReplyTest = new CommentReply(vidTest, "This is a reply", 200, 3);
    CommentReply ReplyReply = new CommentReply(vidTest, vidCommentReplyTest.text + " To a reply", 12, 2);

}