	public class NodeDoble
	{
		//Declare class variables
		private NodeDoble next;
		private NodeDoble prev;
		private Object data;

		public void setNextLink(NodeDoble X){
           this.next=X;
		}


		public void setPrevLink(NodeDoble X){
           this.prev=X;
		}


		public NodeDoble getNextLink(){
			return this.next;
		}

	    public NodeDoble getPrevLink(){
			return this.next;
		}

		
		public NodeDoble(Object dat)
		{
			data = dat;
		}
		
		public Object getData()
		{
			return data;
		}
	}