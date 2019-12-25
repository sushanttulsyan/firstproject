public void disconnect(){
  //System.err.println(this+":disconnect "+io+" "+connected);
  //Thread.dumpStack();
  try{
    synchronized(this){
      if(!connected){
        return;
      }
      connected=false;
    }
    close();
    eof_remote=eof_local=true;
    thread=null;
    try{
      if(io!=null){
        io.close();
      }
    }
    catch(Exception e){
      //e.printStackTrace();
    }
    // io=null;
  }
  finally{
    Channel.del(this);
  }
}
