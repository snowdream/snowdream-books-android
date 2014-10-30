vfprintf（格式化输出数据至文件）
相关函数
printf，fscanf，fprintf
表头文件
#include<stdio.h>
#include<stdarg.h>
定义函数
int vfprintf(FILE *stream,const char * format,va_list ap);
函数说明
vfprintf()会根据参数format字符串来转换并格式化数据，然后将结果输出到参数stream指定的文件中，直到出现字符串结束(’\0’)为止。关于参数format字符串的格式请参考printf()。va_list用法请参考附录C或vprintf()范例。
返回值
成功则返回实际输出的字符数，失败则返回-1，错误原因存于errno中。
范例
参考fprintf()及vprintf()。