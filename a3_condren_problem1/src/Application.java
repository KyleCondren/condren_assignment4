
public class Application {
	public static void main(String[] args) {
		Duplicate_Remover duplicateRemover = new Duplicate_Remover();
		duplicateRemover.remove("problem1.txt");
		duplicateRemover.write("unique_words.txt");
	}
}