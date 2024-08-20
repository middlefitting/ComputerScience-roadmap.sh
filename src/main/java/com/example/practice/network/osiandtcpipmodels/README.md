## OSI 모델

OSI 모델은 다양한 통신 시스템들이 표준 프로토콜을 사용하여 통신을 수행할 수 있도록 만든 개념적 모델입니다.

총 7개의 레어어가 스택처럼 쌓여서 위아래의의 계층과 상호작용합니다.

OSI 모델을 잘 이해하면 문제가 발생했을때, 특정 레이어로 버그 포인트를 좁힐 수 있습니다.

### The application layer

유저와 직접적인 상호작용을 수행합니다. 

웹 브라우저, 이메일 클라이언트와 같은 프로그램들은 애플리케이션 레이어를 사용하여 통신을 시작합니다.

여기서 애플리케이션 != 애플리케이션 레이어 라는 것에 유념합니다.

애플리케이션들이 애플리케이션 레이어를 사용한다는 것은 표현 계층에서 전달한 데이터를, 특정 프로토콜에 맞게 해석하고 처리하는 것입니다.

### The presentation layer

전송 계층의 역할은 애플리케이션 계층에서 사용할 데이터를 준비하는 것입니다. 

대표적으로 3가지의 역할을 가집니다.

- Encryption: 데이터의 암호화, 복호화를 수행합니다.
- Compression: 데이터의 압축 및 해제를 수해앟ㅂ니다.
- Translation: 여러 인코딩 메소드에 대응하여 변역을 수행합니다.

### The session layer

디바이스간 세션의 시작, 관리, 종료의 역할을 수행합니다.

데이터 전송에 있어 체크포인트를 관리하는 역할도 수행하는데요, 큰 용량의 파일을 전송하는 과정에서 체크포인트를 설정하여, 연결이 끊기거나 충돌이 발생하는 경우 체크포인트에서 세션을 재개합니다.

### The transport layer

두 디바이스 간 엔드포인트 통신을 담당합니다.

송신자는 데이터를 세그먼트라는 단위로 쪼개어 전송하고, 수신자는 세그먼트를 조립하는 역할을 수행합니다.

프로토콜에 따라 최적의 전송속도를 결정하거나, 전송받지 못한 세그먼트를 재요청하는 전송제어를 수행하기도 합니다.

### The network layer

목적지에 해당하는 네트워크를 라우팅을 통해 찾아가는 역할을 수행합니다.

송신자 수신자 디바이스가 같은 네트워크에 속한다면 생략될 수 있다는 것을 의미하기도 합니다.

최적의 경로를 설정하는 역할도 수행하는데요, 최적의 경로라는 것은 물리적인 거리를 의미하는 것이 아니라, 최단 시간에 도달할 수 있는 것을 의미합니다.

네트워크 전송 단위인 패킷이라는 작은 단위로 데이터를 분할해서 전송하고, 조립합니다.

### The data link layer

데이터 링크 계층은 목적지를 찾아간다는 점에서 네트워크 계층과 유사합니다.

하지만 네트워크 계층은 목적지의 다른 네트워크를 찾아가는 것이고, 데이터 링크 계층은 같은 네트워크에 속한 특정 디바이스를 찾아간다는 점에서 차이가 있습니다.

물리 디바이스의 위치는 MAC 주소를 통해 찾아가게 됩니다.

프레임이라는 단위로 데이터를 전송하고 패킷으로 조립하는 역할을 수행합니다.

### The physical layer

리피터를 통해 데이터를 전송합니다. 프레임별로 데이터를 비트 스트림으로 변환하여 전송하고, 이를 조립하는 역할을 담당합니다.

## TCP/IP

TCP/IP는 현대 인터넷과 네트워크에서 광범위하게 채택한 구현 모델입니다.

다음과 같이 4계층으로 구성되어 있습니다.

- The application layer
- The transport layer
- The internet layer
- The network access layer

### Protocols
- The application layer: HTTP, FTP, SSH, DNS, SMTP
- The transport layer: TCP, UDP
- The internet layer: IP, ICMP, ARP

### Protocol Data Units (PDUs)

레이어 데이터를 사용하는 용어를 의미합니다.

- The application layer: Data
- The transport layer: Segments or Datagrams
- The internet layer: Packets
- The network access layer: Frames and Bits

### Addressing
- The application layer: Data
- The transport layer: Segments - Ports
- The internet layer: Packets - IP
- The network access layer: Frames - Physical Addresses

### Device
- The application layer: ALG
- The transport layer: Firewalls
- The internet layer: Routers and Layer 3 Switches 
- The network access layer: Bridges, Switches, Repeaters
