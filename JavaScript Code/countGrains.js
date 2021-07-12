var sum = 0;
var grains = 1;
for(let i = 0; i < 8; i++)
{
    for(let j = 0; j < 8; j++)
    {
        if(i == 0 && j == 0)
            sum = 1  
        else{
            grains = grains * 2;
            sum = sum + grains;
        }           
    }
}

console.log("Total Grains : ",sum);
