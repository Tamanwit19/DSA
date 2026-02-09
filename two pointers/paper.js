function verifyUser(username, callback) {
  // TODO
  if(typeof username !== "string" || username.length < 3){
    return callback("error", null)
  }
  setTimeout(()=>{
    return callback(null, {username, verified : true})
  })
}



// question-2

function calculatePrice(basePrice) {
  // TODO
  return new Promise((resolve, reject)=>{
    if(typeof basePrice !== "number" || basePrice <= 0){
        reject(`error with price`)
        return;
    }else{
        setTimeout(()=>{
            let finalPrice = basePrice + basePrice*0.18;
            resolve({basePrice, tax : 0.18, finalPrice})
        }, 600)
    }
  })
}


// question-3
async function checkLogin(attempts) {
  // TODO
  if(attempts < 1){
    throw new Error(`error`)
  }
  setTimeout(()=>{
    if(attempts >= 3){
        return new Promise.reject(`Account locked`)
    }else{
        return new Promise.resolve(`Login allowed`)
    }
  }, 500)
}

async function checkLogin(attempts) {
  if (attempts < 1) {
    throw new Error("Invalid attempt count");
  }

  await new Promise((resolve) => setTimeout(resolve, 500));

  if (attempts >= 3) {
    return "Account Locked";
  } else {
    return "Login Allowed";
  }
}




// question-4

async function sendSequential(messages) {
  // TODO
  for(let msg of messages){
    await msg();
  }
}


// question-5
async function safeRun(task) {
  // TODO
  if(task){
    return task;
  }else{
    throw new Error(`Failed gracefully`)
  }
}
