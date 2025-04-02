### **Network ACLs (NACLs)**

Network ACLs provide an additional layer of security at the subnet level.

---

#### **Frontend NACL Inbound Rules**

| Rule Number | Type           | Protocol  | Port Range | Source           | Allow/Deny |
|-------------|----------------|-----------|------------|------------------|------------|
| 100         | SSH (22)       | TCP (6)   | 22         | 192.168.0.0/28   | Allow      |
| 120         | Custom TCP     | TCP (6)   | 3000       | 192.168.0.0/28   | Allow      |
| 130         | HTTPS (443)    | TCP (6)   | 443        | 192.168.0.0/24   | Allow      |
| 140         | HTTP (80)      | TCP (6)   | 80         | 192.168.0.0/24   | Allow      |
| 180         | SSH (22)       | TCP (6)   | 22         | 192.168.0.64/27  | Allow      |
| *           | All traffic    | All       | All        | 0.0.0.0/0        | Deny       |

#### **Frontend NACL Outbound Rules**

| Rule Number | Type           | Protocol  | Port Range       | Destination       | Allow/Deny |
|-------------|----------------|-----------|------------------|-------------------|------------|
| 100         | SSH (22)       | TCP (6)   | 22               | 192.168.0.0/28    | Allow      |
| 120         | Custom TCP     | TCP (6)   | 1024 - 65535     | 0.0.0.0/0         | Allow      |
| 160         | HTTP (80)      | TCP (6)   | 80               | 0.0.0.0/0         | Allow      |
| 180         | HTTPS (443)    | TCP (6)   | 443              | 0.0.0.0/0         | Allow      |
| 200         | Custom TCP     | TCP (6)   | 8080 - 8083      | 192.168.0.64/27   | Allow      |
| *           | All traffic    | All       | All              | 0.0.0.0/0         | Deny       |

---

#### **application_nacl Inbound Rules**

| Rule number | Type      | Protocol | Port range | Source       | Allow/Deny |
|-------------|-----------|----------|------------|--------------|------------|
| 100         | SSH       | TCP      | 22         | 192.168.0.0/28  | Allow      |
| 110         | SSH       | TCP      | 22         | 192.168.0.16/28  | Allow      |
|110 | Custom TCP |TCP (6) | 1024 - 65535 | 0.0.0.0/0 | Allow|
| 110         | Custom TCP| TCP      | 8080-8083       | 192.168.0.0/28 | Allow      |
| 120         | Http        | TCP      | 80         | 192.168.0.0/24 | Allow      |
| 120         | Http        | TCP      | 443         | 192.168.0.0/24 | Allow      |
| 130         | Http        | TCP      | 80         | 192.168.0.0/28  | Allow      |
| *           | All traffic | All     | All        | 0.0.0.0/0    | Deny       |

#### **application_nacl Outbound Rules**

| Rule Number | Type           | Protocol  | Port Range       | Destination       | Allow/Deny |
|-------------|----------------|-----------|------------------|-------------------|------------|
| 80          | Custom TCP     | TCP (6)   | 1024 - 65535     | 0.0.0.0/0         | Allow      |
| 120         | HTTPS (443)    | TCP (6)   | 443              | 0.0.0.0/0         | Allow      |
| 130         | HTTP (80)      | TCP (6)   | 80               | 0.0.0.0/0         | Allow      |
| 140         | Custom TCP     | TCP (6)   | 8080 - 8083      | 192.168.0.16/28   | Allow      |
| 150         | Custom TCP     | TCP (6)   | 8080 - 8083      | 192.168.0.0/28    | Allow      |
| 200         | Custom TCP     | TCP (6)   | 9042             | 192.168.0.16/28   | Allow      |
| 300         | Custom TCP     | TCP (6)   | 6379             | 192.168.0.16/28   | Allow      |
| 400         | PostgreSQL (5432) | TCP (6) | 5432             | 192.168.0.16/28   | Allow      |
| *           | All traffic    | All       | All              | 0.0.0.0/0         | Deny       |

---

#### **Database NACL Inbound Rules**

| Rule Number | Type           | Protocol  | Port Range       | Source             | Allow/Deny |
|-------------|----------------|-----------|------------------|--------------------|------------|
| 80          | All traffic    | All       | All              | 0.0.0.0/0          | Allow      |
| 90          | Custom TCP     | TCP (6)   | 1024 - 65535     | 0.0.0.0/0          | Allow      |
| 100         | SSH (22)       | TCP (6)   | 22               | 192.168.0.0/28     | Allow      |
| 200         | Custom TCP     | TCP (6)   | 9042             | 192.168.0.64/27    | Allow      |
| 300         | Custom TCP     | TCP (6)   | 6379             | 192.168.0.64/27    | Allow      |
| 400         | PostgreSQL (5432) | TCP (6) | 5432             | 192.168.0.64/27    | Allow      |
| *           | All traffic    | All       | All              | 0.0.0.0/0          | Deny       |

#### **Database NACL Outbound Rules**

| Rule Number | Type           | Protocol  | Port Range       | Destination        | Allow/Deny |
|-------------|----------------|-----------|------------------|--------------------|------------|
| 80          | All traffic    | All       | All              | 0.0.0.0/0          | Allow      |
| 90          | Custom TCP     | TCP (6)   | 1024 - 65535     | 0.0.0.0/0          | Allow      |
| 100         | SSH (22)       | TCP (6)   | 22               | 192.168.0.0/28     | Allow      |
| 200         | Custom TCP     | TCP (6)   | 1024 - 65535     | 192.168.0.64/27    | Allow      |
| 300         | Custom TCP     | TCP (6)   | 8080 - 8083      | 192.168.0.64/27    | Allow      |
| *           | All traffic    | All       | All              | 0.0.0.0/0          | Deny       |

---
