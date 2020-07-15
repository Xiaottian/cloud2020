import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author jit
 * @date 2020/6/4
 * 文件
 */
public class FileTest {

    public static void main(String[] args) {
        File source = new File("C:\\Users\\jit\\Desktop\\会员画像.png");
        File dest = new File("C:\\Users\\jit\\Desktop\\会员画像2.png");
        try {
            long start = System.currentTimeMillis();
            copyFileUsingJava7Files(source, dest);
            long end = System.currentTimeMillis();
            System.out.println("Time taken by Java7 Files Copy = "
                    + (end - start));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyFileUsingJava7Files(File source, File dest)
            throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }
}
