package com.techgig;

/**
 * Created by soniiatm on 6/5/2017.
 */
public class Path {

    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void cd(String newPath) {
        if(path != null ){
            try {
                path = path.substring(0, path.lastIndexOf("/"));
                newPath = newPath.substring(newPath.lastIndexOf("/"));
                path = path + newPath;
            }
            catch (StringIndexOutOfBoundsException se){
                //throw new RuntimeException ("Error Occured while substring",se);
            }
        }
    }



    public static void main(String[] args) {
       //Path path = new Path("/a/b/c/d");
        Path path = new Path("abcdd");
        path.cd("../x");
        System.out.println(path.getPath());
    }
}
