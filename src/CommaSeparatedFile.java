public class CommaSeparatedFile
{
	private String fileName;
	private String separator;
	private int fileSize;

	public CommaSeparatedFile (String file, int size)
	{
		this.separator = ",";
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

	public String printComma ()
	{
		return this.separator;
	}
}
