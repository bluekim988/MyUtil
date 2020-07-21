package Utils;
import java.io.*;

/**
 * 이 클래스는 파일 업로드에 필요한 기능을 처리하기 위해서 만든 유틸리티 클래스
 * @author	김종형
 *
 */
public class FileUtil {
	public static String rename(String path, String oldName) {
		/*
		 	규칙]
		 		같은 이름의 파일이 존재하면 _1 의 형태로 숫자를 붙여서 바꾸는 방식을 사용하자
		 */
		int count = 0;
		String tmpName = oldName;
		File file = new File(path, oldName);
		while(file.exists()) {
			count++;
			
			int len = tmpName.lastIndexOf(".");
			String tmp1 = tmpName.substring(0, len); // 파일이름
			String tmp2 = tmpName.substring(len);	// 확장자
			
			oldName = tmp1 + "_" + count + tmp2;
			
			file = new File(path, oldName);
		}
		return oldName;
	}
}
