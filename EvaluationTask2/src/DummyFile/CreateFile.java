// 課題2 CreateFile.java
package DummyFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile; //RandomAccessFileをインポート文に追加
//クラスやインターフェースを使用するために、そのクラスやインターフェースが定義されているパッケージをインポートする必要がある。
class CreateFile {
	protected static boolean createDummyFile(int byteSize) {
		File file = new File("./DummyFile");
		file.delete();
		try(RandomAccessFile rFile = new RandomAccessFile(file.getPath(), "rw")){ 
			rFile.setLength(byteSize);
			rFile.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
	return true;
	}
}