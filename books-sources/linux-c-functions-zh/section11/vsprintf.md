vsprintf（格式化字符串复制）
<pre>相关函数
vnsprintf，vprintf，snprintf
表头文件
#include< stdio.h>
定义函数
int vsprintf( char * str,const char * format,va_list ap);
函数说明
vsprintf()会根据参数format字符串来转换并格式化数据，然后将结果复制到参数str所指的字符串数组，直到出现字符串结束(’\0’)为止。关于参数format字符串的格式请参考printf()。va_list用法请参考附录C或vprintf()范例。
返回值
成功则返回参数str字符串长度，失败则返回-1，错误原因存于errno中。
范例
请参考vprintf()及vsprintf()。</pre>