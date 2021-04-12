public class Issue {
    private Date lastChangedDate ;
    private String lastChangedAuthorName ;
    private String lastChangedField ;
    private String lastChangedFieldOldValue ;
    private String title ;
    private String description ;
    private User assignee ;
    private String status ;
    private String [] tags ;
    private List<List<Object>> comments = new ArrayList < >();
    public void addComment ( User commenter , String text , Date date ){
        String username = commenter . userProfile . dataItems . get ( " username " );
        List<Object> comment = new ArrayList<>();
        comment.add ( commenter );
        comment.add ( text );
        comment.add ( date );
        commends.add ( comment );
    }
    public void setStatus ( User user , String status ){
        this.lastChangedDate = new Date();
        this.lastChangedAuthorName =
        user.userProfile . dataItems.get ( " username " );
        lastChangedField = " status " ;
        this.lastChangedFieldOldValue = this.status ;
        this.status = status ;
    }
    public void setTitle ( String title , User user ){
        this.lastChangedDate = new Date();
        this.lastChangedAuthorName =
        user.userProfile.dataItems . get ( " username " );
        lastChangedField = " title " ;
        this.lastChangedFieldOldValue = this . title ;
        this.title = title ;
    }
}
    