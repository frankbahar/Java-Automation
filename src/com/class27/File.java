package com.class27;

public abstract class File {
	abstract void open();

	void edit() {
		System.out.println("File can edit");
	}

	void close() {
		System.out.println("File can close");
	}

}

class JavaFile extends File {

	void open() {
		System.out.println("Open a Java file you need notepadd++ or sublime tex");
	}
}

class WordFile extends File {
	void open() {
		System.out.println("Open a Word file you need Microsoft word");
	}
}

class PDFFile extends File {
	void open() {
		System.out.println("Open a PDF file you need Adobe Reader");
	}
}