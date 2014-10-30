vscanf（格式化字符串输入）
<pre>相关函数
vsscanf，vfscanf
表头文件
#include< stdio.h>
#include< stdarg.h>
定义函数
int vscanf( const char * format,va_list ap);
函数说明
vscanf()会将输入的数据根据参数format字符串来转换并格式化数据。格式转换形式请参考scanf()。转换后的结果存于对应的参数内。va_list用法请参考附录C或vprintf()范例。
返回值
成功则返回参数数目，失败则返回-1，错误原因存于errno中。
范例
请参考scanf()及vprintf()。</pre>