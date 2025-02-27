package atk112.cli;

public class ClassGlobalConsts {
    public static String fullTitle = "ATOM Kit - Client - 1.1.2";
    public static String semiTitle = "AtomKit";
    public static String minititle = "atk";
    public static String cliver = "1.1.2";
    public static String edition = "client-jdk21-common";

    public String getFullTitle(){
        return this.fullTitle;
    }
    public String getSemiTitle(){
        return this.semiTitle;
    }
    public String getCliver(){
        return this.cliver;
    }
    public String getEdition(){
        return this.edition;
    }

    public ClassGlobalConsts(String fullTitle,
                             String semiTitle,
                             String cliver,
                             String edition )
    {
        this.fullTitle = fullTitle;
        this.semiTitle = semiTitle;
        this.cliver = cliver;
        this.edition = edition;
    }
}
