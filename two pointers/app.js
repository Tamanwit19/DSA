// // function getWeather(city){
// //     return new Promise((resolve, reject)=>{
// //         if(city == "London"){
// //             setTimeout(()=>{resolve("15 celcius")}, 500)
// //         }else{
// //             reject("No coverage")
// //         }
// //     })
// // }

// // getWeather("London")
// //     .then((temp)=>{console.log("success : ", temp); return "The weather is  : "+ temp})
// //     .then((msg)=>console.log("Final message :", msg))
// //     .catch((err)=>console.log("failed : ", err))

// // question-1
// // function placeOrder(pizzaType) {
// //   // Your implementation
// //   return new Promise((resolve, reject) => {
// //     if (pizzaType == "Margherita") {
// //       setTimeout(() => {
// //         resolve(Math.floor(Math.random() * 1000));
// //       }, 500);
// //     } else {
// //       reject("Pizza not available");
// //     }
// //   });
// // }

// // function preparePizza(orderId) {
// //   // Your implementation
// //   return new Promise((resolve, reject) => {
// //     if (orderId) {
// //       setTimeout(() => {
// //         resolve(`Order ${orderId} is ready`);
// //       }, 1000);
// //     }else{
// //         reject(`Order Id not found`)
// //     }
// //   });
// // }

// // // --- YOUR TASK: CHAIN THEM HERE ---
// // // placeOrder("Margherita")
// // //   .then(...)
// // //   .then(...)
// // //   .catch(...)

// // placeOrder("Margherita")
// //     .then(placeOrder((orderId)=>{
// //       console.log(`order placed with order id ${orderId}`)
// //       return preparePizza(orderId)
// //     }))
// //     .then(preparePizza((orderId)=>{
// //       console.log(`Kitchen msg ${orderId}`)
// //     }))
// //     .catch((err)=>{console.log(err)})


// // question-2

// // function fetchUserProfile(userId){
// //   return new Promise(
// //     setTimeout(()=>{
// //       if(userId){
// //         resolve({
// //           id: userId,
// //           theme: "dark"
// //         })
// //       }else{
// //         reject("theme not determined")
// //       }
// //     }, 500)
// //   );
// // }

// // function getThemeConfig(themename){
// //   return new Promise(
// //     setTimeout(()=>{
// //       if(themename == "dark"){
// //         resolve({
// //           color: "#000",
// //           font: "Arial"
// //         })
// //       }else{
// //         reject("Theme not found")
// //       }
// //     }, 500)
// //   );
// // }

// // fetchUserProfile("user_01")
// //   .then(fetchUserProfile((userId)=>{
// //     return getThemeConfig(userId.theme);
// //   }))
// //   .then(getThemeConfig((themename)=>{
// //     console.log(`theme config applied`)
// //   }))
// //   .catch((err)=>{
// //     console.log(err)
// //   })



// // question-3
// // --- IMPLEMENT THESE ---
// // function validateAccount(acc) {
// //   return new Promise((resolve, reject)=>{
// //     setTimeout(()=>{
// //       if(acc == "1234"){
// //         resolve();
// //       }else{
// //         reject()
// //       }
// //     }, 500)
// //   })
// // }
// // function transferFunds(amt) { 
// //   return new Promise((resolve, reject)=>{
// //     setTimeout(()=>{
// //       if(amt){
// //         resolve()
// //       }else{
// //         reject()
// //       }
// //     }, 500)
// //   })
// // }

// // validateAccount("9999")
// //   .then(validateAccount((acc)=>{
// //     console.log(`account validated`)
// //     return transferFunds(400);
// //   }))
// //   .then(transferFunds((amt)=>{
// //     console.log(msg)
// //   }))
// //   .catch((err)=>{console.log('acc not found')})

// // --- CHAIN THEM HERE ---
// // Try to validate account "9999" (which should fail)
// // Show how you catch that error without the code crashing.


// // const getName = () => Promise.resolve("Tamanwit");
// // const greet = (name) => Promise.resolve("Hello, " + name);

// // getName()
// //   .then((name)=>{
// //     return greet(name);
// //   })
// //   .then((msg)=>{
// //     console.log(`${msg}`);
// //   })
// //   .catch((err)=>{console.log(err)})
// // --- YOUR TASK: WRITE THE PIPELINE ---
// // 1. Start with getName()
// // 2. .then((res) => { ... return the next call ... })
// // 3. .then((finalValue) => { ... log it ... })



// // function checkStock(item){
// //   return new Promise((resolve, reject)=>{
// //     setTimeout(()=>{
// //       if(item == "laptop"){
// //         resolve(true);
// //       }else{
// //         reject(`out of stock`);
// //       }
// //     }, 300)
// //   });
// // }
// // function calculateTax(price){
// //   return new Promise((resolve, reject)=>{
// //     setTimeout(()=>{
// //       if(price > 0){
// //         resolve(price*1.5);
// //       }else{
// //         reject(`not available`);
// //       }
// //     }, 300)
// //   })
// // }

// // chaining
// // checkStock("laptop")
// //   .then((itemFound)=>{
// //     if(itemFound){
// //       return calculateTax(1000);
// //     }else{
// //       return calculateTax(-1);
// //     }
// //   })
// //   .then((newPrice)=>{
// //     console.log(`Final price ${newPrice}`);
// //   })
// //   .catch((err)=>{console.log(err)});


// // // async await 
// // // Mocking the functions for you
// // const validateUser = (user) => Promise.resolve({ id: 101, name: user });
// // const getUserPosts = (id) => Promise.resolve(["Post A", "Post B"]);

// // --- YOUR TURN ---
// // async function displayDashboard(username) {
// //     // Implement the logic here
// //     try{
// //       let user = await validateUser(username)
// //       let post = await getUserPosts(user.id);
// //       console.log(post)
// //     } catch(err){
// //       console.log(err);
// //     }
// // }

// // Mock functions
// const checkSubscription = (id) => Promise.resolve({ tier: "premium" });
// const getPremiumContent = () => Promise.resolve(["Movie 1", "Movie 2"]);
// const getFreeContent = () => Promise.resolve(["Trailer 1"]);

// // --- YOUR TASK ---
// async function loadContent(userId) {
//     // Write your conditional async logic here
//     try{
//       let tier = await checkSubscription(userId);
//       if(tier.tier == "premium"){
//         let content = await getPremiumContent();
//         console.log(content)
//       }else{
//         let contentFree = await getFreeContent();
//         console.log(contentFree);
//       }
//     }catch(err){
//       console.log(err);
//     }
// }









async function fetchProduct(productId) {
  // TODO
  if(productId <= 0){
    throw new Error(`error`)
  }
  await new Promise((resolve)=>{setTimeout(resolve, 1000)})
  return {id : productId, status : "available"}
}



async function runSequential(tasks) {
  // TODO
  for(const task of tasks){
    await task()
  }
}

async function fetchAll(apis) {
  // TODO
  const promises = apis.map((api)=>api())
  return await Promise.all(promises)
}




if(index == length){
  return;
}
fetchByCb(files[index], (err, content)=>{
  if(err){
    console.log(err)
    return;
  }

  ansArray.push(`Content -> ${content}`)
  function(index+1, files, ansArray)
})