package fun.n.learn.annotation;

// TODO : No it did not work the way that I expected them to. 
// http://programmaticallyspeaking.com/playing-with-java-annotation-processing.html
public class CheckLogMeCustomAnnotation {
	@LogMeCustomAnnotation
	public void justToSeeTheCustomAnnotationWorking() {
	}

	public static void main(String[] args) {
		System.out.println("checking");
	}
}
