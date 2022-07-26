package packageEK;

public class UrlExtractor {
    public String parsing(String url){
        String[] split = url.split("/");
        return split[3];
    }
}
