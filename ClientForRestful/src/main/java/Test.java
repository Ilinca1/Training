import java.util.Date;

/**
 * Created by ivamesu on 7/27/2016.
 */
public class Test {
    public static void main(String[] args) {
        Comment comment = new Comment("Mike", "mike@endava.com", "bad", new Date());
        CommentWebServiceClientImpl commentWebServiceClient = new CommentWebServiceClientImpl();
        // commentWebServiceClient.findAll();
        // commentWebServiceClient.save(comment);
        // System.out.println(commentWebServiceClient.findById((long) 1));
        // comment.setName("Mike");
        // commentWebServiceClient.update(comment, (long) 2);
        // commentWebServiceClient.delete((long) 5);

        for (Comment comment1 : commentWebServiceClient.findAll())
            System.out.println(comment1);


    }
}
