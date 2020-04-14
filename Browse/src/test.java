/*
 * Test1.java
 *
 * Created on 2007-10-2, 17:29:30
 *
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class test extends JPanel implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	//
	// private JTextField input;
	// private JButton go;
	// private IWebBrowser web;
	//
	// public test() {
	// super(new BorderLayout());
	// initWindow();
	// }
	//
	// private void initWindow() {
	// try {
	// web = new WebBrowser();
	// web.addWebBrowserListener(new MyListener());
	// go = new JButton("转到");
	// input = new JTextField();
	// JPanel up = new JPanel(new BorderLayout());
	// up.add(input, BorderLayout.CENTER);
	// up.add(go, BorderLayout.EAST);
	// this.add(up, BorderLayout.NORTH);
	// this.add(web.asComponent(), BorderLayout.CENTER);
	// input.addActionListener(this);
	// go.addActionListener(this);
	// } catch (Exception ex) {
	// Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
	// }
	// JFrame jf = new JFrame("JAVA浏览器");
	// jf.add(this, BorderLayout.CENTER);
	// jf.setSize(500, 300);
	// jf.setLocationRelativeTo(null);
	// jf.setVisible(true);
	// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// }
	//
	// public void actionPerformed(ActionEvent ae) {
	// doOpen();
	// }
	//
	// private void doOpen() {
	// try {
	// String text = input.getText();
	// if (text == null || text.equals("")) {
	// return;
	// }
	// if (!text.toLowerCase().startsWith("http://")) {
	// text = "http://" + text;
	// }
	// web.setURL(new URL(text));
	// } catch (MalformedURLException ex) {
	// Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
	// }
	// }
	//
	// public static void main(String[] args) {
	// new test();
	// }
	//
	// private class MyListener extends WebBrowserListenerAdapter {
	//
	// private MyListener() {}
	//
	// @Override
	// public void documentCompleted(WebBrowserEvent arg0) {
	// System.out.println("文档下载完。。。");
	// web.executeScript("alert('文档下载完毕！')");
	// // web.setContent("<html><H1>Hello world!!<H1>" +
	// // "<a href=http://www.google.cn>点我</a></html>");
	// // web.removeWebBrowserListener(this);
	// }
	// }
}