strdup（复制字符串）
<pre>相关函数
calloc，malloc，realloc，free
表头文件
#include< string.h>
定义函数
char * strdup( const char *s);
函数说明
strdup()会先用maolloc()配置与参数s字符串相同的空间大小，然后将参数s字符串的内容复制到该内存地址，然后把该地址返回。该地址最后可以利用free()来释放。
返回值
返回一字符串指针，该指针指向复制后的新字符串地址。若返回NULL表示内存不足。
范例
#include< string.h>
main()
{
char a[]="strdup";
char *b;
b=strdup(a);
printf("b[ ]=\"%s\"\n",b);
}
执行
b[ ]="strdup"</pre>