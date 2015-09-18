/**
 * Created by japrietov on 17/09/15.
 */
public class File {
    public String fileType;
    public Byte content;
    public double size;

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Byte getContent() {
        return content;
    }

    public void setContent(Byte content) {
        this.content = content;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void download(){}

    public void share(){}
}
