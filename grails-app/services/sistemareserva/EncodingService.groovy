package sistemareserva

import grails.transaction.Transactional

@Transactional
class EncodingService {

    def encode(def str) {
      def digest = MessageDigest.getInstance("MD5")
      def cod = new BigInteger(1,digest.digest(str.getBytes())).toString(16).padLeft(32,"0")
      return cod
    }
}
