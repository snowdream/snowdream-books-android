vfscanf（格式化字符串输入）
<pre>相关函数
scanf，sscanf，fscanf
表头文件
#include< stdio.h>
定义函数
int vfscanf(FILE * stream,const char * format ,va_list ap);
函数说明
vfscanf()会自参数stream 的文件流中读取字符串，再根据参数format字符串来转换并格式化数据。格式转换形式请参考scanf()。转换后的结果存于对应的参数内。va_list用法请参考附录C 或vprintf()。
返回值
成功则返回参数数目，失败则返回-1，错误原因存于errno中。
范例
参考fscanf()及vprintf()。</pre>