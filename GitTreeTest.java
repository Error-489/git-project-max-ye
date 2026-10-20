import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class GitTreeTest {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        ArrayList<String> currList = new ArrayList<>(); 

        currList.add("blob 483b5e082cf5502b303ba3dd4f3469a49fd3421f myProgram/docs/World.txt");
        currList.add("blob 4377a91cdfd44db9a9bbf056849c7da0fc6cc7be myProgram/README.md");
        currList.add("blob 0a4d55a8d778e5022fab701977c5d840bbc486d0 myProgram/docs/Hello.txt");

        ArrayList<String> originalList = new ArrayList<>(workingList);
}
}