// // // // // // // // // // // // function getTemperature(sensorId, callback) {
// // // // // // // // // // // //   // Your implementation here
// // // // // // // // // // // //   if(sensorId == null || sensorId == undefined){
// // // // // // // // // // // //     return callback("Invalid sensor id", null);
// // // // // // // // // // // //   }
// // // // // // // // // // // //   setTimeout(()=>{
// // // // // // // // // // // //     let temp = Math.min(Math.random()*16+15);
// // // // // // // // // // // //     if(temp > 28){
// // // // // // // // // // // //         callback("Sensor heating", null);
// // // // // // // // // // // //     }else{
// // // // // // // // // // // //         callback(null, temp);
// // // // // // // // // // // //     }
// // // // // // // // // // // //   }, 1500);
// // // // // // // // // // // // }

// // // // // // // // // // // // // Testing the function
// // // // // // // // // // // // getTemperature("LIVING_ROOM_01", (err, temp) => {
// // // // // // // // // // // //   if (err) {
// // // // // // // // // // // //     console.error("Error:", err);
// // // // // // // // // // // //   } else {
// // // // // // // // // // // //     console.log(`Current Temperature: ${temp}°C`);
// // // // // // // // // // // //   }
// // // // // // // // // // // // });


// // // // // // // // // // // // Mock functions (Do not change)
// // // // // // // // // // // function verifyUser(user, pass, cb) {
// // // // // // // // // // //   setTimeout(() => {
// // // // // // // // // // //     if (user === "admin" && pass === "1234") cb(null, "user_99");
// // // // // // // // // // //     else cb("Invalid Credentials", null);
// // // // // // // // // // //   }, 500);
// // // // // // // // // // // }

// // // // // // // // // // // function getAccessLevel(userId, cb) {
// // // // // // // // // // //   setTimeout(() => {
// // // // // // // // // // //     if (userId === "user_99") cb(null, "Administrator");
// // // // // // // // // // //     else cb("Access Denied", null);
// // // // // // // // // // //   }, 500);
// // // // // // // // // // // }

// // // // // // // // // // // // --- YOUR TASK ---
// // // // // // // // // // // function loginSystem(user, pass, finalCallback) {
// // // // // // // // // // //   // Use sequential callbacks here (handle the nesting/callback hell)
// // // // // // // // // // //   verifyUser(user, pass, (err, userId)=>{
// // // // // // // // // // //     getAccessLevel(userId, (err2, access)=>{
// // // // // // // // // // //         const finalresult = {
// // // // // // // // // // //             userId : userId,
// // // // // // // // // // //             access : access
// // // // // // // // // // //         }

// // // // // // // // // // //         finalCallback(null, finalresult)
// // // // // // // // // // //     })
// // // // // // // // // // //   })
// // // // // // // // // // // }

// // // // // // // // // // // // Testing
// // // // // // // // // // // loginSystem("admin", "1234", (err, result) => {
// // // // // // // // // // //   if (err) console.error("Login Failed:", err);
// // // // // // // // // // //   else console.log("Login Success:", result);
// // // // // // // // // // // });



// // // // // // // // // // /**
// // // // // // // // // //  * @param {number} userId 
// // // // // // // // // //  * @param {function} callback - (err, status) => { ... }
// // // // // // // // // //  */
// // // // // // // // // // function authenticateUser(userId, callback) {
// // // // // // // // // //     // 1. Validate Input (Immediate return if invalid)
// // // // // // // // // //     if (typeof userId !== 'number') {
// // // // // // // // // //         return callback(new Error("Invalid User ID: Must be a number"), null);
// // // // // // // // // //     }

// // // // // // // // // //     console.log(`Authenticating user ${userId}...`);

// // // // // // // // // //     // 2. Simulate Async DB Call
// // // // // // // // // //     setTimeout(() => {
// // // // // // // // // //         // TODO: Implement the logic based on the requirements above
// // // // // // // // // //         // Use: callback(null, "Success Message") for success
// // // // // // // // // //         // Use: callback("Error Message", null) for logical errors
// // // // // // // // // //         if(userId == 99){
// // // // // // // // // //             callback(null, "User found and active")
// // // // // // // // // //         }else if(userId == 100){
// // // // // // // // // //             callback(null, "acc suspended")
// // // // // // // // // //         }else{
// // // // // // // // // //             callback(null, "acc not found")
// // // // // // // // // //         }
// // // // // // // // // //     }, 1000);
// // // // // // // // // // }

// // // // // // // // // // // --- TEST CASES ---
// // // // // // // // // // authenticateUser(99, (err, status) => {
// // // // // // // // // //     if (err) console.error("❌ Test 1 Failed:", err);
// // // // // // // // // //     else console.log("✅ Test 1 Success:", status); 
// // // // // // // // // // });

// // // // // // // // // // authenticateUser(100, (err, status) => {
// // // // // // // // // //     if (err) console.log("✅ Test 2 (Expected Error):", err);
// // // // // // // // // //     else console.log("❌ Test 2 Failed:", status);
// // // // // // // // // // });

// // // // // // // // // // authenticateUser("abc", (err, status) => {
// // // // // // // // // //     if (err) console.log("✅ Test 3 (Validation caught string):", err.message);
// // // // // // // // // // });





// // // // // // // // // // Mock (Do not change)
// // // // // // // // // function checkBankStatus(cb) {
// // // // // // // // //     setTimeout(() => cb(null, "online"), 300);
// // // // // // // // // }
// // // // // // // // // function processPayment(amt, cb) {
// // // // // // // // //     setTimeout(() => cb(null, `SUCCESS_ID_${amt}`), 300);
// // // // // // // // // }

// // // // // // // // // // --- YOUR TASK ---
// // // // // // // // // function makePayment(amount, finalCallback) {
// // // // // // // // //     // 1. Call checkBankStatus...
// // // // // // // // //     // 2. If online, call processPayment...
// // // // // // // // //     // 3. Finally, return the success ID to finalCallback
// // // // // // // // //     checkBankStatus((err, status)=>{
// // // // // // // // //         if(err)
// // // // // // // // //             return finalCallback(err, null);
// // // // // // // // //         if(status == "online"){
// // // // // // // // //             processPayment(amount, (err2, msg)=>{
// // // // // // // // //                 finalCallback(null, msg);
// // // // // // // // //             })
// // // // // // // // //         }
// // // // // // // // //     })
// // // // // // // // // }

// // // // // // // // // // Test
// // // // // // // // // makePayment(500, (err, result) => {
// // // // // // // // //     if (err) console.error("Payment Failed:", err);
// // // // // // // // //     else console.log("Payment Proof:", result);
// // // // // // // // // });



// // // // // // // // // Mock (Do not change)
// // // // // // // // function fetchUsername(id, cb) {
// // // // // // // //     setTimeout(() => cb(null, "Tamanwit"), 400);
// // // // // // // // }
// // // // // // // // function fetchAvatar(id, cb) {
// // // // // // // //     setTimeout(() => cb(null, "https://avatar.com/u123"), 400);
// // // // // // // // }

// // // // // // // // // --- YOUR TASK ---
// // // // // // // // function buildProfile(userId, finalCallback) {
// // // // // // // //     // Nest the callbacks here. 
// // // // // // // //     // Get the name, then get the URL, then send the object back.
// // // // // // // //     fetchUsername(userId, (err, name)=>{
// // // // // // // //         fetchAvatar(userId, (err2, link)=>{
// // // // // // // //             const profile = {
// // // // // // // //                 name : name, 
// // // // // // // //                 avatar : link
// // // // // // // //             }

// // // // // // // //             finalCallback(null, profile)
// // // // // // // //         })
// // // // // // // //     })
// // // // // // // // }

// // // // // // // // // Test
// // // // // // // // buildProfile("user_1", (err, profile) => {
// // // // // // // //     if (err) console.error("Error:", err);
// // // // // // // //     else console.log("Final Profile:", profile);
// // // // // // // // });





// // // // // // // // q-1



// // // // // // // function sendEmail(email, callback) {
// // // // // // //   // TODO: Implement email sending logic
// // // // // // //   setTimeout(()=>{
// // // // // // //     if(!email.includes('@') || typeof email !== "string"){
// // // // // // //         return callback("Invalid email address", null);
// // // // // // //     }
// // // // // // //     callback(null, {email : email, sent : true});
    
// // // // // // //   }, 800)
// // // // // // // }



// // // // // // // q-2
// // // // // // function scheduleAlert(message, delayMs) {
// // // // // //   // TODO
// // // // // //   if(delayMs < 0){
// // // // // //     console.log(`error`)
// // // // // //     return
// // // // // //   }
// // // // // //   setTimeout(()=>{
// // // // // //     console.log(message)
// // // // // //   }, delayMs)
// // // // // // }


// // // // // // q-3

// // // // // function confirmOrder(orderId, callback) {
// // // // //   // TODO
// // // // //   if(orderId < 0){
// // // // //     return callback("err", null);
// // // // //   }
// // // // //   setTimeout(()=>{
// // // // //     return (null, {orderId, status : "confirmed"})
// // // // //   }, 1000)
// // // // // }










// // // // // promises

// // // // function placeOrder(pizzaType) {
// // // //     // Your implementation
// // // //     return new Promise((resolve, reject)=>{
// // // //         if(pizzaType == "margherita"){
// // // //             setTimeout(()=>{
// // // //                 let id = Math.random()*1000;
// // // //                 resolve(id);
// // // //             }, 500)
// // // //         }else{
// // // //             reject(`pizza not available`)
// // // //         }
// // // //     })
// // // // }

// // // // function preparePizza(orderId) {
// // // //     // Your implementation
// // // //     return new Promise((resolve, reject)=>{
// // // //         setTimeout(()=>{
// // // //             if(orderId){
// // // //                 resolve(`order ${orderId} is ready`)
// // // //             }else{
// // // //                 reject(`errr`);
// // // //             }
// // // //         }, 1000)
// // // //     })
// // // // }

// // // // // --- YOUR TASK: CHAIN THEM HERE ---
// // // // // placeOrder("Margherita")
// // // // //   .then(...)
// // // // //   .then(...)
// // // // //   .catch(...)
// // // // placeOrder("margherita")
// // // //     .then((orderId)=>{
// // // //         console.log(`order placed with order id`, orderId)
// // // //         return preparePizza(orderId)
// // // //     })
// // // //     .then((msg)=>{
// // // //         console.log(msg)
// // // //     })
// // // //     .catch((err)=>{
// // // //         console.log(err)
// // // //     })





// // // // --- IMPLEMENT THESE ---
// // // function fetchUserProfile(userId) {
// // //     // Return a promise that resolves with an object
// // //     return new Promise((resolve, reject)=>{
// // //         setTimeout(()=>{
// // //             if(userId){
// // //                 resolve({id : userId, theme : "dark"})
// // //             }else{
// // //                 reject(`errr`)
// // //             }
// // //         }, 500)
// // //     })
// // // }

// // // function getThemeConfig(theme) {
// // //     // Return a promise that resolves with config or rejects
// // //     return new Promise((resolve, reject)=>{
// // //         if(theme == "dark"){
// // //             resolve({color : "#000", font : "Arial"})
// // //         }else{
// // //             reject(`theme not found`)
// // //         }
// // //     })
// // // }

// // // // --- CHAIN THEM HERE ---
// // // // Start with userId "user_01"
// // // fetchUserProfile(userId)
// // //     .then((themedata)=>{
// // //         return getThemeConfig(themedata.theme)
// // //     })
// // //     .then((themeclr)=>{
// // //         console.log(themeclr)
// // //     })
// // //     .catch((err)=>{
// // //         console.log(err);
// // //     })










// // // --- IMPLEMENT THESE ---
// // function validateAccount(acc) { /* ... */ }
// // function transferFunds(amt) { /* ... */ }

// // // --- CHAIN THEM HERE ---
// // // Try to validate account "9999" (which should fail)
// // // Show how you catch that error without the code crashing.
// // validateAccount(acc)
// //     .then(()=>{return transferFunds(amt)})
// //     .then((msg)=>{
// //         console.log(msg)
// //     })
// //     .catch((err)=>{console.log(err)})



// // Mock functions
// const getName = () => Promise.resolve("Tamanwit");
// const greet = (name) => Promise.resolve("Hello, " + name);

// // --- YOUR TURN: WRITE THE 3-STEP PROCEDURE ---
// // 1. getName()...
// // 2. .then((res) => { ... })
// // 3. .then((final) => { ... })







// // --- IMPLEMENT THESE ---
// function getUserRole(userId) {
//     // Return a promise resolving with an object: { id: userId, role: "admin" }
//     return new Promise((resolve, reject)=>{
//         if(userId){
//             setTimeout(()=>{
//                 resolve({id : userId, role : "admin"});
//             }, 500)
//         }
//     })
// }

// function checkAccountStatus(role) {
//     // Return a promise resolving with a string or rejecting
//     return new Promise((resolve, reject)=>{
//         if(role === "admin"){
//             resolve(`account is active`)
//         }else{
//             reject(`access denied`)
//         }
//     })
// }

// // --- YOUR TASK: THE CHAIN ---
// // Start with userId "user_99"
// // 1. getUserRole("user_99")
// // 2. .then((user) => { return checkAccountStatus(user.role) })
// // 3. .then((status) => { console.log(status) })
// getUserRole(userId)
//     .then((user)=>{return checkAccountStatus(user.role)})
//     .then((status)=>{console.log(status)})