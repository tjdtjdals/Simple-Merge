package WMController;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class LineToken {

	private String a;
	private String b;

	public int Num_left_line;
	public int Num_right_line;

	public ArrayList<String> left;
	public ArrayList<String> right;

	public void Linetokenize() {

		a = new String();
		b = new String();

		a = WMModel.TextPaneData.getLeftPanelText();
		b = WMModel.TextPaneData.getRightPanelText();
		
		Num_left_line = 0;
		Num_right_line = 0;

		StringTokenizer L_lineT = new StringTokenizer(a);
		StringTokenizer R_lineT = new StringTokenizer(b);

		left = new ArrayList<String>();
		right = new ArrayList<String>();

		left.clear();
		right.clear();
		
		left.add("left");
		right.add("right");
		
		while (L_lineT.hasMoreTokens()) {
			left.add(L_lineT.nextToken("\n"));
			Num_left_line++;
		}
		
		while (R_lineT.hasMoreTokens()) {
			right.add(R_lineT.nextToken("\n"));
			Num_right_line++;
		}
	}

	public int getNumRightLine() {
		return Num_right_line;
	}

	public int getNumLeftLine() {
		return Num_left_line;
	}

	public String getLeftStr(int n) {
		return left.get(n);
	}

	public String getRightStr(int n) {
		return right.get(n);
	}
}