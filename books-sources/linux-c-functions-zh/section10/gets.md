gets（由标准输入设备内读进一字符串）
<pre>相关函数
fopen，fread，fscanf，fgets
表头文件
#include< stdio.h>
定义函数
char * gets(char *s);
函数说明
gets()用来从标准设备读入字符并存到参数s所指的内存空间，直到出现换行字符或读到文件尾为止，最后加上NULL作为字符串结束。
返回值
gets()若成功则返回s指针，返回NULL则表示有错误发生。
附加说明
由于gets()无法知道字符串s的大小，必须遇到换行字符或文件尾才会结束输入，因此容易造成缓冲溢出的安全性问题。建议使用fgets()取代。
范例
参考fgets()</pre>