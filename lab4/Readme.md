# File handling in Java using FileWriter and FileReader
Java FileWriter and FileReader classes are used to write and read data from text files (they are Character Stream classes). It is recommended not to use the FileInputStream and FileOutputStream classes if you have to read and write any textual information as these are Byte stream classes.

## FileWriter:
**FileWriter is useful to create a file writing characters into it.**
> - This class inherits from the OutputStream class.
> - The constructors of this class assume that the default character encoding and the default byte-buffer size are acceptable. To specify these values yourself, construct an OutputStreamWriter on a FileOutputStream.
> - FileWriter is meant for writing streams of characters. For writing streams of raw bytes, consider using a FileOutputStream..
> - FileWriter creates the output file , if it is not present already.

## FileReader:
**FileReader is useful to read data in the form of characters from a ‘text’ file.**
> - This class inherit from the InputStreamReader Class.
> - The constructors of this class assume that the default character encoding and the default byte-buffer size are appropriate. To specify these values yourself, construct an InputStreamReader on a FileInputStream.
> - FileReader is meant for reading streams of characters. For reading streams of raw bytes, consider using a FileInputStream.
