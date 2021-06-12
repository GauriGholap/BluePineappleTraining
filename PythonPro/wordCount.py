#Write a program to find word frequency.
import operator
def freq(str):
    str = str.split()         
    str2 = []
    word_dict = {}

    for i in str:           
        if i not in str2:
            str2.append(i) 
              
    for i in range(0, len(str2)):  
        word_dict[str2[i]] = str.count(str2[i]) 
    
    sorted_dict = dict(sorted(word_dict.items(), key = operator.itemgetter(1), reverse = True))
    for x, y in sorted_dict.items():
      print('Frequency of ',x,' is :',y)  

if __name__=="__main__":
    str = input('Enter any String : ')		
    freq(str)
  

#Enter any String : uh jo ok uh ok ij tf rd uh tf ok ij ok pl ok
# Frequency of  ok  is : 5
# Frequency of  uh  is : 3
# Frequency of  ij  is : 2
# Frequency of  tf  is : 2
# Frequency of  jo  is : 1
# Frequency of  rd  is : 1
# Frequency of  pl  is : 1  