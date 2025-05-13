import java.io.*;

// this class extends FilterInputStream
// it decorates a FileStream
// it outputs the text in a file as alternating lower and uppercase characters.

public class UpperLowerInputStream extends FilterInputStream{
    private Boolean upper;

    public UpperLowerInputStream(InputStream in){
        super(in);
        upper = true;
    }

    public int read() throws IOException {
        int c = super.read();
        c = (c == -1 ? c : (
                upper ? Character.toUpperCase((char)c) : Character.toLowerCase((char)c)
                )
            );
        upper = !upper;

        return c;
    }

    public static void main(String[] args){
        int c;
        try{
            // decorating the file input stream on two levels
            InputStream in = new UpperLowerInputStream(
                new BufferedInputStream(
                    new FileInputStream("test.txt")
                )
            );
            while((c = in.read()) >= 0){
                System.out.print((char)c);
            }
            System.out.println();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}