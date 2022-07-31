package packageEK.model;

public class UrlExtractor {
    public int parsing(String uri){
        String[] split = uri.split("/");
        int id = Integer.parseInt(split[3]);
        return id;
    }
}
