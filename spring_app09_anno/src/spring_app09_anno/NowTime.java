package spring_app09_anno;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NowTime {
	public String getTime() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(" HH½Ã mmºÐ");
		
		return sdf.format(d);
	}
}
