package com.accenture.module26;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateFormatTH extends TagSupport {

	private String format;

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		
		JspWriter out = pageContext.getOut();
		try {
			Date date = new Date();
			SimpleDateFormat sf=null;
			if (getFormat() != null) {				
				sf = new SimpleDateFormat(getFormat());
				out.println(sf.format(date));
			} else {
				out.println(date);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return SKIP_BODY;
	}
}
