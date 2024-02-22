class R {

    String fieldString;
    R fieldR;

    R(String fieldString, R fieldR) {

        this.fieldString = fieldString;
        this.fieldR = fieldR;

    }
}

class ExamplesR {

    R exampleRObject = new R("Test", new R("Object", null));
    R exampleRObject1 = new R("Test", null);

}

// Open-Ended 2    #1

/*

Yes, it is possible to create an R object as an instance of the R class, 
we can either fill out the R parameter with null,
or create a new instance of the R object for the R parameter.

 */


// Open-Ended 2    #2

/*
 No, with the way that Drill3 is setup you cannot reply to a reply to a comment.
 This is because the type of reply to is of type VideoComment.
 So you can reply to an original comment, not not a comment of type CommentReply (reply to a reply)
 The way to change this would be to have the tpye of replyTo, to be of type CommentReply.

 Here is an example of what a nested reply would look like.

 CommentReply ogComment = new CommentReply(null, "First comment", 3, 5);
 CommentReply replyToOg = new CommentReply(ogComment, "reply to og", 3, 5);
 CommentReply replyToReplytoOG = new CommentReply(replyToOg, "reply to the reply to og", 2, 3);

 We would need our unitialized variables to look like this, and the constructor updates accordingly.

 class CommentReply {
    CommentReply replyTo;
    String text;
    int likes;
    int replies;

 */
