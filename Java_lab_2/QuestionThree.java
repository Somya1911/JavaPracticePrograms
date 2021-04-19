class QuestionThree{
	public static void main(String args[]){
		try{
			int[] arr=new int[2];
			arr[0]=1;
			arr[1]=2;
			System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("filin: " + e.fillInStackTrace());
			System.out.println("cause: " + e.getCause());
			System.out.println("local:"+e.getLocalizedMessage());
			System.out.println("messa: " + e.getMessage());
			System.out.println("trace: " + e.getStackTrace());
			System.out.print("trace:");
			e.printStackTrace();
			System.out.print("string: ");
			e.toString();

			
			throw (ArrayIndexOutOfBoundsException) new Exception().initCause(e);
		}
	}
}