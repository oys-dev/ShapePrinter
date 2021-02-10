
public class ShapePrinter {
	public void printFloydsPyramid(int height) {
        
		// ���� �ڸ� ���ϱ� (5)
		int length = String.valueOf(height * (height + 1) / 2).length();
		
		// �μ�� �� (6)
		int num = 1;
		
		//�ݺ��� 1 - ���� �ٲٴ� �ݺ��� (1)
        for(int i = 1; i <= height; i++) {
        	
        	// �� �࿡�� �μ�� ������ ��� ���ڿ� ���� (3)
        	String line = "";
        	
        	//�ݺ��� 2 - ���� �ٲٴ� �ݺ��� (2)
        	for(int j = 1; j <= i; j++) {
        		
        		// �ݺ��� 3 - �� �� �ȿ��� �ڸ����� ���ߴ� �ݺ��� (7)
        		for(int k = String.valueOf(num).length(); k < length; k++) {
        			line += " ";
        		}
        		
        		// ���� �μ�� ���� ���ڿ��� ���ϰ� �� ĭ ����ֱ� (8)
        		line += num + " ";
        		num++;
        	}
        	
        	//��� (4)
        	System.out.println(line);
        }
        
    }

    
}
