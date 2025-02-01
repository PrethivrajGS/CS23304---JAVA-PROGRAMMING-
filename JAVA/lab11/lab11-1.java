import java.io.File;
class Main
{
    public static void main( String [] args )
    {
        File f = new File( "/sample.txt");
        System.out.println("File Name : " + f.getName() );
        System.out.println("Path : " + f.getPath() );
        System.out.println("Absolute Path : " + f.getAbsolutePath() );
        System.out.println( (f.canWrite() ) ? "is Writeable" : " is not Writeable" );
        System.out.println( (f.canRead() ) ? "is Readable" : " is not Readable" );
        System.out.println("File last modified : " + f.lastModified() );
        System.out.println("File Size : " + f.length() + " Bytes" );
    }
}