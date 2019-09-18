public class TabSeparatedFile
{
	private String fileName;
	private String separator;
	private int fileSize;

	public TabSeparatedFile (String file, int size)
	{
		this.separator = "\t";
		this.fileName = file;
		this.fileSize = size;
	}

	public String getFilename ()
	{
		return this.fileName;
	}

	public int getFileSize ()
	{
		return this.fileSize;
	}

	public String printTab ()
	{
		return this.separator;
	}
}
