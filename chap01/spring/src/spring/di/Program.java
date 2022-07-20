package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.MskimExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamconsole;
import spring.di.ui.InlineExamconsole;

public class Program {
	public static void main(String[] args) {
		Exam exam= new MskimExam();
//		ExamConsole console=new InlineExamconsole(exam);
		ExamConsole console=new GridExamconsole(exam);
		console.print();
	}
}
