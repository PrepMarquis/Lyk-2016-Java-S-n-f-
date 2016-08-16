
public abstract class EBook extends Book{
	
	private static Integer price;
	private static Integer bookID;
	private static String name;
	private static String author;
	protected Integer fileSize;
	protected String encodingFormat;
	protected Integer numDeviceBeingUsed;
	
	public EBook(String author, String name, Integer price, Integer bookID) {
		super(author,name,price,bookID);
		
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public String getEncodingFormat() {
		return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	public Integer getNumDeviceBeingUsed() {
		return numDeviceBeingUsed;
	}

	public void setNumDeviceBeingUsed(Integer numDeviceBeingUsed) {
		this.numDeviceBeingUsed = numDeviceBeingUsed;
		
	}
	
	public boolean addDevice;
	public boolean removeDevice;
	
	
		
	

	@Override
	public String toString() {
		return "EBook [fileSize=" + fileSize + ", encodingFormat=" + encodingFormat + ", numDeviceBeingUsed="
				+ numDeviceBeingUsed + "]";
	}

	public void addDevice() {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
}
	
	
	
	
