
const userId = $('#userId').text();

$(function(){
	
	console.log(userId);
	
	$("#sendBtn").click(function() {
		sendMessage(userId);
		$('#message').val('')
	});
	$("#disConBtn").click(function(evt){
		disconnect();
	});
})


let sock = new SockJS("/handler",{transports: ["websocket", "xhr-streaming", "xhr-polling"]}); //RequestMapping 경로
sock.onopen = onOpen;
sock.onmessage = onMessage; //샌드에 보내진 값을 메시지 펑션애 보내는 경우?
sock.onclose = onClose; //닫힘 혹은 에러가 났을때 onclose 펑션
	//소켓 오픈
function onOpen(evt){
	const item = `${userId}:님이 입장하였습니다.`
	sock.send(item)
}
	// 메시지 전송
function sendMessage(userId) {
		sock.send(`${userId}: `+ $("#message").val());
		console.log(`${userId} 전송`)
		
	}
	// 서버로부터 메시지를 받았을 때
function onMessage(msg) {
	
		let data = msg.data;
	
		let sessionId = null;
		let message = null;
		let arr = data.split(":");

       for(var i=0; i<arr.length; i++){
            console.log('arr[' + i + ']: ' + arr[i]);
          }
		var cur_user = userId;
		
	
		//현재 세션에 로그인 한 사람
         console.log("cur_user : " + cur_user);
         sessionId = arr[0];
         message = arr[1];

         console.log("sessionId : " + sessionId);
         console.log("sessionId Type : " + typeof sessionId);
         console.log("cur_user : " + cur_user);
         console.log("cur_user Type : " + typeof cur_user);
         console.log(sessionId == cur_user)
          //로그인 한 클라이언트와 타 클라이언트를 분류하기 위함
                if(sessionId == cur_user){
                    var str = "<div class='col-6'>";
                    str += "<div class='badge bg-primary'>";
                    str += "<b>" + sessionId + " : " + message + "</b>";
                    str += "</div></div>";
                    $("#messageArea").append(str);
                }
          
                else{
					console.log(`${sessionId} 보냄`)
                    var str = "<div class='col-6'>";
                    str += "<div class='badge bg-warning text-dark'>";
                    str += "<b>" + sessionId + " : " + message + "</b>";
                    str += "</div></div>";
                    $("#messageArea").append(str);
                }
                
	}
	// 서버와 연결을 끊었을 때
function onClose(evt) {
		const item = `${userId} : 님이 퇴장하였습니다.`
	    sock.send(item)

	}
