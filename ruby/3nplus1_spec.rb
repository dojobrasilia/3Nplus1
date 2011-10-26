
class Integer
  def par?
    self % 2 == 0
  end
end

def lengthOfSeries(n)
  cont = 1
  while(n>1)
    n = proximo(n)
    cont += 1
  end
  cont
end

def proximo(n)
  (n.par?) ? n/2 : 3*n+1
end

def largestSeries(a,b)
  (a..b).map { |i| lengthOfSeries(i) }.max
end

describe '3n+1' do
  
  it 'should generate series for powers of two' do
    lengthOfSeries(1).should == 1
    lengthOfSeries(2).should == 2
    lengthOfSeries(4).should == 3
    lengthOfSeries(8).should == 4
    lengthOfSeries(16).should == 5
  end
  
  it 'should generate series for 5' do
    lengthOfSeries(5).should == 6
  end

  it 'should find the largest series between 1 and 1' do
    largestSeries(1,1).should == 1
  end
  it 'should find the largest series between 1 and 2' do
    largestSeries(1,2).should == 2
  end
  
end