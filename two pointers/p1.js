function validateEmail(email, callback) {
  // TODO
    if(typeof email !== "string" || !email.includes('@')){
        return callback("err", null)
    }
  setTimeout(()=>{
    callback(null, "valid email")
  }, 500)
}



function serialRead(idx, files, result) {
  // TODO
  if(idx == files.length) return;
  readFileCb(files[idx], (err, content)=>{
    result.push(`DATA -> ${content}`);
    serialRead(idx+1, files, result);
  })
}



function delay(ms) {
  // TODO
  return new Promise((res, rej)=>{
    if(ms <= 0){
        rej(`err`)
        return
    }else{
        setTimeout(()=>{
            res()
        }, ms)
    }
  })
}



function calculatePrice(price) {
  // TODO
  return new Promise((res, rej)=>{
    if(price <= 0){
        rej(`err`)
        return
    }else{
        setTimeout(()=>{
            let fp = (price+price*0.18);
            res({price, tax:0.18, fp})
        }, 500)
    }
  })
}



async function fetchUser(userId) {
  // TODO
    if(userId <= 0){
        throw new Error(`err`)
    }
    await new Promise((resolve)=>{
        setTimeout(resolve, 300)
    })

    return {id:userId, active : true}
}



async function runSequential(tasks) {
  // TODO
  const results = [];
  for(let task of tasks){
    const r = await task();
    results.push(r);
  }
  return results;
}



async function strictRun(tasks) {
  // TODO
  for(let task of tasks){
    await task();
  }
}



function retryOnce(task) {
  // TODO
  return task().catch(()=> task())
}



function promisify(fn) {
  // TODO
  return new Promise((res, rej)=>{
    fn((err, r)=>{
        if(err) rej("err")
        else{
            resolve(r)
        }
    })
  })
}


function readCb(name, cb) {
  setTimeout(() => {
    if (!name) cb("error");
    else cb(null, "data-" + name);
  }, 300);
}

function validateEmail(email, callback) {
  // TODO
    if(typeof email !== "string" || !email.includes('@')){
        return callback(err, null)
    }
  setTimeout(()=>{
    callback(null, "valid email")
  }, 500)
}



function serialRead(idx, files, result) {
  // TODO
  if(idx == files.length) return;
  readFileCb(files[idx], (err, content)=>{
    result.push(`DATA -> ${content}`);
    serialRead(idx+1, files, result);
  })
}



function delay(ms) {
  // TODO
  return new Promise((res, rej)=>{
    if(ms <= 0){
        rej(`err`)
    }else{
        setTimeout(()=>{
            resolve(`msg`)
        }, ms)
    }
  })
}



function calculatePrice(price) {
  // TODO
  return new Promise((res, rej)=>{
    if(price <= 0){
        rej(`err`)
    }else{
        setTimeout(()=>{
            let fp = (price+price*0.18);
            res({price, tax:0.18, fp})
        }, 500)
    }
  })
}



async function fetchUser(userId) {
  // TODO
    if(userId <= 0){
        throw new Error(`err`)
    }
    setTimeout(()=>{
        return {id:userId, active:true}
    }, 300)
}



async function runSequential(tasks) {
  // TODO
  for(let task of tasks){
    return await task();
  }
}



async function strictRun(tasks) {
  // TODO
  for(let task of tasks){
    return new Promise.all((rej)=>{throw new Error(`error`)})
  }
}



function retryOnce(task) {
  // TODO
  return new Promise((res, rej)=>{
    if(task)
        res(`msg`)
    else
        rej(task())
  })
}




function promisify(fn) {
  // TODO
  return new Promise((res, rej)=>{
    if(fn())
        res(`msg`)
    else
        rej(`err`)
  })
}



function readCb(name, cb) {
  setTimeout(() => {
    if (!name) cb("error");
    else cb(null, "data-" + name);
  }, 300);
}

async function readAsync(name) {
  return new Promise((resolve, reject) => {
    readCb(name, (err, data) => {
      if (err) reject(err);
      else resolve(data);
    });
  });
}






// Mock API for testing
function fetchPrimaryAPI() {
    return Promise.reject("Server Down");
}

async function getWidgetData() {
  // TODO: Implement try/catch logic here
  try{
    let msg = await fetchPrimaryAPI();
    return msg
  } catch(err){
    console.log(err)
    return
  }
}





async function getAllData() {
  // SLOW VERSION (Refactor this):
  // const user = await fetchUser();
  // const posts = await fetchPosts();
  // const friends = await fetchFriends();
  // return [user, posts, friends];
  
  // TODO: Write Fast Version
  return await Promise.all([fetchUser(), fetchPosts(), fetchFriends()])
}