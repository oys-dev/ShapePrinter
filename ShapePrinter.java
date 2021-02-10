
public class ShapePrinter {
	public void printFloydsPyramid(int height) {
        
		// 숫자 자리 구하기 (5)
		int length = String.valueOf(height * (height + 1) / 2).length();
		
		// 인쇄될 수 (6)
		int num = 1;
		
		//반복문 1 - 행을 바꾸는 반복문 (1)
        for(int i = 1; i <= height; i++) {
        	
        	// 한 행에서 인쇄될 내용을 담는 문자열 선언 (3)
        	String line = "";
        	
        	//반복문 2 - 열을 바꾸는 반복문 (2)
        	for(int j = 1; j <= i; j++) {
        		
        		// 반복문 3 - 한 열 안에서 자리수르 맞추는 반복문 (7)
        		for(int k = String.valueOf(num).length(); k < length; k++) {
        			line += " ";
        		}
        		
        		// 실제 인쇄될 수를 문자열에 더하고 한 칸 띄워주기 (8)
        		line += num + " ";
        		num++;
        	}
        	
        	//출력 (4)
        	System.out.println(line);
        }
        
    }

    
}
