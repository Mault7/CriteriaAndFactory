package Parsing;

import java.util.ArrayList;

public class Parsing {

	String subStr;

	public Parsing(String url) {

		this.subStr = url.substring(url.indexOf("?") + 1, url.length());
	}

	public int counterParameters() {

		int totalparameters = 0;
		char temp;

		for (int i = 0; i < this.subStr.length(); i++) {

			temp = this.subStr.charAt(i);

			if (temp == '=') {

				totalparameters++;
			}
		}
		return totalparameters;
	}

	public ArrayList<String> instruccion() {

		ArrayList<String> data = new ArrayList<String>();

		for (int i = 0; i < this.counterParameters(); i++) {

			String temp = this.subStr.split("&")[i];
			data.add(temp.substring(0, temp.indexOf("=")));

		}

		return data;
	}

	public ArrayList<String> parameter() {

		ArrayList<String> data = new ArrayList<String>();

		for (int i = 0; i < this.counterParameters(); i++) {

			String temp = this.subStr.split("&")[i];
			data.add(temp.substring(temp.indexOf("=") + 1, temp.length()));
		}
		return data;
	}

	
}
